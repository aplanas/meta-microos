SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-neovim-0.4.3-1.14.noarch.rpm"
RPM_HASH = "3dcdb6ea2d46902918729e10ded9b0c16ba39d50a6128791622c9441b88330bda20903816af81f66d17a92037f5236d1a2ca49f91ddf73babdd77de861aef705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-neovim \
python3-nvim \
python3.11dist-pynvim \
python311-neovim \
python311-nvim \
python3dist-pynvim"

RDEPENDS:${PN} += "neovim \
python-abi \
python311-greenlet \
python311-msgpack-python"

inherit rpm
