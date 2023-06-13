SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-neovim-0.4.3-1.12.noarch.rpm"
RPM_HASH = "543650635e97c71e9ade86a2f83e7c60045ec23175810848d69a74670bba23a39ae4f330e0986de17497f8cf510e4d4b529944d038968b8241f456752d3d61da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pynvim) \
python39-neovim \
python39-nvim \
python3dist(pynvim)"

RDEPENDS:${PN} += "neovim \
python(abi) \
python39-greenlet \
python39-msgpack-python"

inherit rpm
