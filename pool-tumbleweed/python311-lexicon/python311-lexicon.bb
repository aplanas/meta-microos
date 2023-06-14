SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python311-lexicon-2.0.1-4.1.noarch.rpm"
RPM_HASH = "726d0780ee1358acdee6c07cf2a8a716d94c55ef3fef7cf4eb4a4b924ca34759a134c8c5f2e5eb8ee91f032338516b5cb1462a59f06faf10943bded2a962a71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-lexicon \
python311-lexicon \
python3dist-lexicon"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
