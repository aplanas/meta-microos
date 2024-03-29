SUMMARY = "Helper routines for using Sub::Exporter to build methods"
DESCRIPTION = "The synopsis section, above, looks almost indistinguishable from any other \
use of Sub::Exporter, apart from the use of 'method_installer'. It is \
nearly indistinguishable in behavior, too. The only change is that \
subroutines exported from Method::Builder into named slots in \
Vehicle::Autobot will be wrapped in a subroutine called \
'Vehicle::Autobot::transform'. This will insert a named frame into stack \
traces to aid in debugging. \
 \
More importantly (for the author, anyway), they will not be removed by \
namespace::autoclean. This makes the following code work: \
 \
  package MyLibrary; \
 \
  use Math::Trig qw(tan);         # uses Exporter.pm \
  use String::Truncate qw(trunc); # uses Sub::Exporter's defaults \
 \
  use Sub::Exporter::ForMethods qw(method_installer); \
  use Mixin::Linewise { installer => method_installer }, qw(read_file); \
 \
  use namespace::autoclean; \
 \
  ... \
 \
  1; \
 \
After MyLibrary is compiled, 'namespace::autoclean' will remove 'tan' and \
'trunc' as foreign contaminants, but will leave 'read_file' in place. It \
will also remove 'method_installer', an added win."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100055"

RPM_NAME = "perl-Sub-Exporter-ForMethods-0.100055-1.4.noarch.rpm"
RPM_HASH = "943183a40272ab4999d38ab8f7908207acc04cb5a2935cbc1951638df29cced32ef773bfeb50c970f88cdff7067e38dfebcf3ad08f9835dbdecda1be60df95c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter--ForMethods \
perl-Sub-Exporter-ForMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter \
perl-Sub--Util"

inherit rpm
