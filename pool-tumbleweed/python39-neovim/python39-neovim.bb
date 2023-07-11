SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-neovim-0.4.3-1.14.noarch.rpm"
RPM_HASH = "91d1c8dab1740265c259483d61a74daa828eabaa571185485858a4af4afdd18a67cd8baa93621f92baee9853fb97f02b74ceec9ad7e56e4a055b3250bff0c5d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynvim \
python39-neovim \
python39-nvim \
python3dist-pynvim"

RDEPENDS:${PN} += "neovim \
python-abi \
python39-greenlet \
python39-msgpack-python"

inherit rpm
