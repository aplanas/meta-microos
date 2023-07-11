SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python311-lexicon-2.0.1-4.3.noarch.rpm"
RPM_HASH = "139edcb11d69fe04bb7690dfe772521a87e0e0126a6e7c277dcd2c95f3196feb3f9a692053f8049b0b68ac01c87cdee252c0395e158d863aac330004d6d1b355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lexicon \
python3.11dist-lexicon \
python311-lexicon \
python3dist-lexicon"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
