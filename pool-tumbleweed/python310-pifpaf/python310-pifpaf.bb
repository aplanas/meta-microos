SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.1.5"

RPM_NAME = "python310-pifpaf-3.1.5-2.4.noarch.rpm"
RPM_HASH = "b8ee4ad950f27d801e0265512e487e0a4aa8eadfd837e27cf5f0f6fa66b3ae8193fbd9b27be3d34db9eef18089ce50907233c937600403cd0dffb59e14f2c912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pifpaf \
python3.10dist-pifpaf \
python310-pifpaf \
python3dist-pifpaf"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Jinja2 \
python310-click \
python310-daiquiri \
python310-fixtures \
python310-psutil \
python310-requests \
python310-testrepository \
python310-testtools \
python310-xattr \
update-alternatives"

inherit rpm
