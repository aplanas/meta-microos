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

RPM_NAME = "python311-pytest-astropy-0.10.0-1.7.noarch.rpm"
RPM_HASH = "e6e8dc87d8be44a2adae3544b15bde5631063ac4bb007da37b863124d44aeadca349bad0476e382f3ba414196095e26a16a3675f8f5b52a714cbda326d73cd3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-astropy \
python3.11dist-pytest-astropy \
python311-pytest-astropy \
python3dist-pytest-astropy"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-hypothesis \
python311-pytest \
python311-pytest-arraydiff \
python311-pytest-astropy-header \
python311-pytest-cov \
python311-pytest-doctestplus \
python311-pytest-filter-subpackage \
python311-pytest-mock \
python311-pytest-openfiles \
python311-pytest-remotedata"

inherit rpm
