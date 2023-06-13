SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python39-methodtools-0.4.2-1.12.noarch.rpm"
RPM_HASH = "db138f691b579608183827f39fb49c23725587de62b26336426f3bf6a075de70c657544e124469ee25a72b53cad6364e688e845206678a3f8a4ebda44e5c4330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(methodtools) \
python39-methodtools \
python3dist(methodtools)"

RDEPENDS:${PN} += "python(abi) \
python39-wirerope"

inherit rpm
