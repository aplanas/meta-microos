SUMMARY = "Docker API Client"
DESCRIPTION = "Provides the functionality needed to operate the pseudo-tty (PTY) allocated to \
a docker container, using the Python client."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python310-dockerpty-0.4.1-5.3.noarch.rpm"
RPM_HASH = "ef9db585757dd875310ba973bb9eefa118c4dadb058d099e99e85ff830e5291a7764f8094f0fab2e820967dd8d872a3ec3828269ff781a0ef34315f60325aad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dockerpty \
python3.10dist(dockerpty) \
python310-dockerpty \
python3dist(dockerpty)"

RDEPENDS:${PN} += "python(abi) \
python310-docker \
python310-six"

inherit rpm
