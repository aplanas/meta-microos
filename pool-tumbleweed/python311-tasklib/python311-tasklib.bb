SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python311-tasklib-2.5.1-1.5.noarch.rpm"
RPM_HASH = "abc50624ba1cb466a667db04c97bb53e22aa757e4842042b2c6fab3a38c555b64a7c620b811074ecaed42b65aa761f1d7aaad8806d60ac12b25bbf8127636a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tasklib \
python3.11dist-tasklib \
python311-tasklib \
python3dist-tasklib"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-tzlocal \
taskwarrior"

inherit rpm
