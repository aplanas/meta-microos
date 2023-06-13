SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python39-lexicon-2.0.1-4.1.noarch.rpm"
RPM_HASH = "2ac95c133cf417ca69e97f50c55e2e126b9cdcef6e0a4455063700d9b61b87b9802360d5f9791ade6f0725f9257a772bffb24286c4c9cdc1fc264965977ffb6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lexicon) \
python39-lexicon \
python3dist(lexicon)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
