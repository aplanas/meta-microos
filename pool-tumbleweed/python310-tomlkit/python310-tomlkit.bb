SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.8"

RPM_NAME = "python310-tomlkit-0.11.8-1.3.noarch.rpm"
RPM_HASH = "fd205d4bea08bcd3716dec950b240e02f4914d02a90d33d335bf19ac8d84995cbcb38b710fcdf8a3594f1f2eb2286a42e5f79bf97ff342e53420c58951a2d088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tomlkit \
python310-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
