SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-django-push-notifications-3.0.0-2.5.noarch.rpm"
RPM_HASH = "3e69715cb445b78e4c80345c5ba93b88eb2742bb2a2ec6ee876f0b166b07859f92599bd10e86489ef579eb5170d0e9cc7c81cc4e359aaf1f44ffb56969115c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-push-notifications \
python310-django-push-notifications \
python3dist-django-push-notifications"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pywebpush"

inherit rpm
