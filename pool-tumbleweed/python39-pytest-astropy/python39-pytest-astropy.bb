SUMMARY = "Meta-package containing dependencies for testing"
DESCRIPTION = "This is a meta-package that pulls in the dependencies that are used by \
astropy and some affiliated packages for testing. It can also be used for \
testing packages that are not affiliated with the Astropy project. \
 \
This package also provides pytest markers for cpu and memory intensive tests \
(`pytest.mark.slow` and `pytest.mark.hugemem`). Tests marked with those \
markers are not run by default, can be run with the other tests with \
`--run-slow` and `--run-hugemem`, and can be run separately with `-m slow` \
and `-m hugemem`."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python39-pytest-astropy-0.10.0-1.5.noarch.rpm"
RPM_HASH = "c6de44241cc5431a6cdfae627e6d4e664f03b8714cac664184451b044711068a583069da19603034574908b24743f6b4372424c9f5a5bf6b95f570c6a83bb69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-astropy) \
python39-pytest-astropy \
python3dist(pytest-astropy)"

RDEPENDS:${PN} += "python(abi) \
python39-attrs \
python39-hypothesis \
python39-pytest \
python39-pytest-arraydiff \
python39-pytest-astropy-header \
python39-pytest-cov \
python39-pytest-doctestplus \
python39-pytest-filter-subpackage \
python39-pytest-mock \
python39-pytest-openfiles \
python39-pytest-remotedata"

inherit rpm
