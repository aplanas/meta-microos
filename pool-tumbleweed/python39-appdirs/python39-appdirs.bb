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

RPM_NAME = "python39-appdirs-1.4.4-4.3.noarch.rpm"
RPM_HASH = "65bfa95203dadb1bf576a941c49739c201b4c1f97c67f40d5f23bb2739017528e6d8b6336fe4e678ab6b7fe5f3756e20bfbf64f7835cd091afe62176623c322e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-appdirs \
python39-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
