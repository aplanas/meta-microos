SUMMARY = "Python client to Neovim"
DESCRIPTION = "Library for scripting Nvim processes through its msgpack-rpc API."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-neovim-0.4.3-1.14.noarch.rpm"
RPM_HASH = "6185c9ccd9a3aff27ef6ec58ef2bf64459341634e599a83a7a6a5b40124a299d672d03efc118fd7d16c3e92477df44349c0753759d562f0a7ac7428d5018153b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynvim \
python310-neovim \
python310-nvim \
python3dist-pynvim"

RDEPENDS:${PN} += "neovim \
python-abi \
python310-greenlet \
python310-msgpack-python"

inherit rpm
