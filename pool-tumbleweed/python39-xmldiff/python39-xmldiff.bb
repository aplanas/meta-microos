SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python39-xmldiff-2.4-4.4.noarch.rpm"
RPM_HASH = "49b127b43df9aade5704f0140ba30b5792bbf2fa03ebd039f9313058b8d0461361eaa4d698913f7e11f505de491def762dc7542f3e4db78cce81137236515666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xmldiff \
python39-xmldiff \
python3dist-xmldiff"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-lxml \
python39-setuptools \
update-alternatives"

inherit rpm
