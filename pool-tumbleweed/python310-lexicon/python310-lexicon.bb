SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python310-lexicon-2.0.1-4.3.noarch.rpm"
RPM_HASH = "2aa46b0b48be4f1db313ee68338a598eb7e48f44cae05b990682bdf3b4462c6de7c378fee6d509317ccdf2da7b447baace5946a96745826ea9fa064ebaff083f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lexicon \
python310-lexicon \
python3dist-lexicon"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
