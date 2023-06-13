SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-neovim-0.4.3-1.12.noarch.rpm"
RPM_HASH = "95c62c1260f7cbfe1546f72ee61cd3b308437f3a6a02d35990773823001f070738b687da89b9de02b77c7502648d4020261cb76b89d82bcfbf31435e90e95384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-neovim \
python3-nvim \
python3.10dist(pynvim) \
python310-neovim \
python310-nvim \
python3dist(pynvim)"

RDEPENDS:${PN} += "neovim \
python(abi) \
python310-greenlet \
python310-msgpack-python"

inherit rpm
