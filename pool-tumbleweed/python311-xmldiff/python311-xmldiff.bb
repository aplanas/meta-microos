SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python311-xmldiff-2.4-4.6.noarch.rpm"
RPM_HASH = "5f9c1e9b3788689e772ba8ce30309ce58f1b471443a7505b50bdccb0848eb05b6ea82eb28ed014dd16388d05c03323efc96ba0237ae32f8972eb79b0a0e8787f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmldiff \
python3.11dist-xmldiff \
python311-xmldiff \
python3dist-xmldiff"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-lxml \
python311-setuptools \
update-alternatives"

inherit rpm
