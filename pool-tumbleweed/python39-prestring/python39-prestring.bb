SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-prestring-0.9.0-2.10.noarch.rpm"
RPM_HASH = "6e94d58320c3e526859c600235dfc254cba08aa51e053393210454a887424c0ebdf9fe117de089fad04f347abc0689162984303d7d79050b804257d372892228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(prestring) \
python39-prestring \
python3dist(prestring)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
