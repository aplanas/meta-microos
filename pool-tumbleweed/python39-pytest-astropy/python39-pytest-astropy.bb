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

RPM_NAME = "python39-pytest-astropy-0.10.0-1.7.noarch.rpm"
RPM_HASH = "ca50efd72097d23709fe353f80211bc342c81e2a3975d13dec9e5aca8e5bad9d305d9d1238c98101f6519b496f3cc224b1a694a51bf2c1db61cc3d77408e5a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-astropy \
python39-pytest-astropy \
python3dist-pytest-astropy"

RDEPENDS:${PN} += "python-abi \
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
