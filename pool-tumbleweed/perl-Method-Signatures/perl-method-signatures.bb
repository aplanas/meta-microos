SUMMARY = "Method and Function Declarations with Signatures and No Source Filter"
DESCRIPTION = "Provides two new keywords, 'func' and 'method', so that you can write \
subroutines with signatures instead of having to spell out 'my $self = \
shift; my($thing) = @_' \
 \
'func' is like 'sub' but takes a signature where the prototype would \
normally go. This takes the place of 'my($foo, $bar) = @_' and does a whole \
lot more. \
 \
'method' is like 'func' but specifically for making methods. It will \
automatically provide the invocant as '$self' (by default). No more 'my \
$self = shift'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "20170211"

RPM_NAME = "perl-Method-Signatures-20170211-1.22.noarch.rpm"
RPM_HASH = "23055ab8cef303ec559bf71378b5b4586008243a1d07eb45a5a7c3de58febb744c46dbaea9a1c03f6af2903792d575bb68f1d92341b54f5a99fec19ff0550d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Signatures \
perl-Method--Signatures--Modifiers \
perl-Method--Signatures--Parameter \
perl-Method--Signatures--Signature \
perl-Method--Signatures--Types \
perl-Method--Signatures--Utils \
perl-Method-Signatures"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Any--Moose \
perl-Const--Fast \
perl-Devel--Declare \
perl-Devel--Declare--MethodInstaller--Simple \
perl-Lexical--SealRequireHints \
perl-Mouse \
perl-PPI \
perl-Sub--Name"

inherit rpm
