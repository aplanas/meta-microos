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

RPM_NAME = "python311-pytest-astropy-0.10.0-1.5.noarch.rpm"
RPM_HASH = "50fb5fe8b9b9322009d04963d390f6fe402020ffbb8e87202bc6b1b4d744342ff351a8faf19c71a663aab63215a479cb3c0e11f4a37af870fbda08a40bcdf10f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-astropy \
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
