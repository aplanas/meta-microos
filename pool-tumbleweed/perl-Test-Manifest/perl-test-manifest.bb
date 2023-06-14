SUMMARY = "Interact with a t/test_manifest file"
DESCRIPTION = "'Test::Harness' assumes that you want to run all of the _.t_ files in the \
_t/_ directory in ASCII-betical order during 'make test' or './Build test' \
unless you say otherwise. This leads to some interesting naming schemes for \
test files to get them in the desired order. These interesting names ossify \
when they get into source control, and get even more interesting as more \
tests show up. \
 \
'Test::Manifest' overrides the default test file order. Instead of running \
all of the _t/*.t_ files in ASCII-betical order, it looks in the \
_t/test_manifest_ file to find out which tests you want to run and the \
order in which you want to run them. It constructs the right value for the \
build system to do the right thing. \
 \
In _t/test_manifest_, simply list the tests that you want to run. Their \
order in the file is the order in which they run. You can comment lines \
with a '#', just like in Perl, and 'Test::Manifest' will strip leading and \
trailing whitespace from each line. It also checks that the specified file \
is actually in the _t/_ directory. If the file does not exist, it does not \
put its name in the list of test files to run and it will issue a warning. \
 \
Optionally, you can add a number after the test name in test_manifest to \
define sets of tests. See 'get_t_files' for more information."
LICENSE = "Artistic-2.0"

PV = "2.023"

RPM_NAME = "perl-Test-Manifest-2.023-1.7.noarch.rpm"
RPM_HASH = "1c668e247ded55a7bd703579118b60b04dfcf2cea9270c5f2a1f1b58be26f043ee0d6c6727c5087c8a5757180679a1e1e237da3e8185b3538acf06bdc1373507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Manifest \
perl-Test-Manifest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
