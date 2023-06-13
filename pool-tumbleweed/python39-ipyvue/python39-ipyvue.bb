SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python39-ipyvue-1.9.1-1.1.noarch.rpm"
RPM_HASH = "e85f7edfa498fc1a530cddd186900a6a773b6e55881fb3340b1909c9ab31677849c7d935cddcf371f9dbaf793a565ace00819dae40640cfd0ee4e671710e3eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyvue) \
python39-ipyvue \
python3dist(ipyvue)"

RDEPENDS:${PN} += "python(abi) \
python39-ipywidgets"

inherit rpm
