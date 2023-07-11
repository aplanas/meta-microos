SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python39-lexicon-2.0.1-4.3.noarch.rpm"
RPM_HASH = "616b269155c421fb2c69f4780aa1ce4bd90e785d677a2b9878c802a400c99146db91a231cf7fa985e6be902fa24e3389ce98b474ad6437e6c57e8455747d8b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lexicon \
python39-lexicon \
python3dist-lexicon"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
