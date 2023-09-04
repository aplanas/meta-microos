SUMMARY = "A small Python module for determining platform-specific dirs"
DESCRIPTION = "``appdirs`` will \
help you choose an appropriate: \
 \
- user data dir (``user_data_dir``) \
- user cache dir (``user_cache_dir``) \
- site data dir (``site_data_dir``) \
- user log dir (``user_log_dir``)"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python39-appdirs-1.4.4-5.1.noarch.rpm"
RPM_HASH = "74549098abb6c7287d211f215ff3a5280bef0df832535ac9695a00b1a10ea040bc0c70e3c33e3f4046c0d1a3ab800c2b39872969066b2e6bcbd372ecb94e0d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-appdirs \
python39-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
