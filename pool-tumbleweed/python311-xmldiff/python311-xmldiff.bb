SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python311-xmldiff-2.4-4.4.noarch.rpm"
RPM_HASH = "d99201da41ff219964e52574e9a6a9830a220555ae97223193332432666a6ecba659745e533a71552a1c9b955bdd55e82cd29d359243aea0fad41184f070616e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xmldiff \
python311-xmldiff \
python3dist-xmldiff"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-lxml \
python311-setuptools \
update-alternatives"

inherit rpm
