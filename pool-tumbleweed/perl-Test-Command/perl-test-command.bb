SUMMARY = "Test routines for external commands"
DESCRIPTION = "'Test::Command' intends to bridge the gap between the well tested functions \
and objects you choose and their usage in your programs. By examining the \
exit status, terminating signal, STDOUT and STDERR of your program you can \
determine if it is behaving as expected. \
 \
This includes testing the various combinations and permutations of options \
and arguments as well as the interactions between the various functions and \
objects that make up your program. \
 \
The various test functions below can accept either a command string or an \
array reference for the first argument. If the command is expressed as a \
string it is passed to 'system' as is. If the command is expressed as an \
array reference it is dereferenced and passed to 'system' as a list. See \
''perldoc -f system'' for how these may differ. \
 \
The final argument for the test functions, '$name', is optional. By default \
the '$name' is a concatenation of the test function name, the command \
string and the expected value. This construction is generally sufficient \
for identifying a failing test, but you may always specify your own '$name' \
if desired. \
 \
Any of the test functions can be used as instance methods on a \
'Test::Command' object. This is done by dropping the initial '$cmd' \
argument and instead using arrow notation. \
 \
All of the following 'exit_is_num' calls are equivalent. \
 \
   exit_is_num('true', 0); \
   exit_is_num('true', 0, 'exit_is_num: true, 0'); \
   exit_is_num(['true'], 0); \
   exit_is_num(['true'], 0, 'exit_is_num: true, 0'); \
 \
   my $cmd = Test::Command->new( cmd => 'true' ); \
 \
   exit_is_num($cmd, 0); \
   exit_is_num($cmd, 0, 'exit_is_num: true, 0'); \
   $cmd->exit_is_num(0); \
   $cmd->exit_is_num(0, 'exit_is_num: true, 0'); \
 \
   $cmd = Test::Command->new( cmd => ['true'] ); \
 \
   exit_is_num($cmd, 0); \
   exit_is_num($cmd, 0, 'exit_is_num: true, 0'); \
   $cmd->exit_is_num(0); \
   $cmd->exit_is_num(0, 'exit_is_num: true, 0');"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Test-Command-0.11-5.26.noarch.rpm"
RPM_HASH = "2a3636972a1b8db69a22d15c4120953039888b7ea30732e4c630a81c088b093638fc6fb9e7538f10ae1f6d8ebf667143fd02c6fd5b96840615d1cedb8e6d7e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Command \
perl-Test-Command"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
