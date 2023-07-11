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

RPM_NAME = "python310-appdirs-1.4.4-4.3.noarch.rpm"
RPM_HASH = "c9c252950fae0b52a3e869dc6770ff2e1ace173955972f2332626b3f2f40f9deec899380740eda80159ea4ea60e60006c37cf92c7e7fb1cebca264ce4d8caeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-appdirs \
python310-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
