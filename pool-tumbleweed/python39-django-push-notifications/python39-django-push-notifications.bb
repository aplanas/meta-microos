SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-django-push-notifications-3.0.0-2.4.noarch.rpm"
RPM_HASH = "2a5e0e77ecf3c6f148b400ae5786413a794f418bed151580e1af72bee42ba9d2de61aaaf24ed52affb40c0fd8ca06ff89fbaaf552a633aca097bf1acaf1a3919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-push-notifications \
python39-django-push-notifications \
python3dist-django-push-notifications"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pywebpush"

inherit rpm
