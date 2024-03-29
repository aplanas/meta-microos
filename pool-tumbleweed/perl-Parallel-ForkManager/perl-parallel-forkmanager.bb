SUMMARY = "Simple Parallel Processing Fork Manager"
DESCRIPTION = "This module is intended for use in operations that can be done in parallel \
where the number of processes to be forked off should be limited. Typical \
use is a downloader which will be retrieving hundreds/thousands of files. \
 \
The code for a downloader would look something like this: \
 \
  use LWP::Simple; \
  use Parallel::ForkManager; \
 \
  ... \
 \
  my @links=( \
    ['http://www.foo.bar/rulez.data','rulez_data.txt'], \
    ['http://new.host/more_data.doc','more_data.doc'], \
    ... \
  ); \
 \
  ... \
 \
   \
  my $pm = Parallel::ForkManager->new(30); \
 \
  LINKS: \
  foreach my $linkarray (@links) { \
    $pm->start and next LINKS; # do the fork \
 \
    my ($link, $fn) = @$linkarray; \
    warn 'Cannot get $fn from $link' \
      if getstore($link, $fn) != RC_OK; \
 \
    $pm->finish; # do the exit in the child process \
  } \
  $pm->wait_all_children; \
 \
First you need to instantiate the ForkManager with the 'new' constructor. \
You must specify the maximum number of processes to be created. If you \
specify 0, then NO fork will be done; this is good for debugging purposes. \
 \
Next, use $pm->start to do the fork. $pm returns 0 for the child process, \
and child pid for the parent process (see also perlfunc(1p)/fork()). The \
'and next' skips the internal loop in the parent process. NOTE: $pm->start \
dies if the fork fails. \
 \
$pm->finish terminates the child process (assuming a fork was done in the \
'start'). \
 \
NOTE: You cannot use $pm->start if you are already in the child process. If \
you want to manage another set of subprocesses in the child process, you \
must instantiate another Parallel::ForkManager object!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Parallel-ForkManager-2.02-1.11.noarch.rpm"
RPM_HASH = "8cbe99047ac618662266c38bef95e962dd52d4ec2cd745cca9824d8940c16e229dbad2c21881b34ceae80b7bb32d3385a71e0172e7f722aac4c944c92b905105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parallel--ForkManager \
perl-Parallel--ForkManager--Child \
perl-Parallel-ForkManager"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo \
perl-Moo--Role"

inherit rpm
