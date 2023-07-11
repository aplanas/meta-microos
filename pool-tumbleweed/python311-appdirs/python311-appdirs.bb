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

RPM_NAME = "python311-appdirs-1.4.4-4.3.noarch.rpm"
RPM_HASH = "e2efef088bcdf62b7fb8f3789ad5e2950199d052cbae9098e39baf4ef8681438485f87c433c77b4db6bbe1c58a99f6447f780596103fd257afaba131938ed8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-appdirs \
python3.11dist-appdirs \
python311-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
