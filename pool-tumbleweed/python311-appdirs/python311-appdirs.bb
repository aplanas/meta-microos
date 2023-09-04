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

RPM_NAME = "python311-appdirs-1.4.4-5.1.noarch.rpm"
RPM_HASH = "ec92d3ba9f30c1bb0f062a63588961c6e9595a366130cd4df5979a689409054867eeca43072460a648363eebfa34ce4521c7fb0ccd09db2a9ad1a69e89afa544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-appdirs \
python3.11dist-appdirs \
python311-appdirs \
python3dist-appdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
