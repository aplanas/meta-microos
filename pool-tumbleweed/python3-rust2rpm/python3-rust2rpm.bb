SUMMARY = "Convert Rust packages to RPM"
DESCRIPTION = "This tool creates RPM spec files for Rust packages. \
The packages can be downloaded from crates.io and this tool \
creates packages that comply with the Fedora Packaging Guidelines, \
Mageia packaging policy, and the openSUSE Packaging Guidelines."
LICENSE = "MIT"

PV = "15"

RPM_NAME = "python3-rust2rpm-15-2.20.noarch.rpm"
RPM_HASH = "4aec0748f4594a9daaa7631b739d7970fb912170de447b7586be71768f2982ed7a77c54784b2ca7be8ac488df0d49c37198789447ac05b54d2c1bf0e2552870a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rust2rpm \
python3.11dist-rust2rpm \
python3dist-rust2rpm \
rust2rpm"

RDEPENDS:${PN} += "/usr/bin/python3 \
cargo \
python-abi \
python3-Jinja2 \
python3-requests \
python3-setuptools \
python3-tqdm"

inherit rpm
