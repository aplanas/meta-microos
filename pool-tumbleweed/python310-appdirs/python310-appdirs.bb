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

RPM_NAME = "python310-appdirs-1.4.4-5.1.noarch.rpm"
RPM_HASH = "2829974dec97a48524cfcc4c6722f72ddc2954864d95de8a5f9ee40a6353020b76d4774437ed98c64a70ec9ea0692b1e3c05fde016be02d56dac619207e6e0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-appdirs \
python310-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
