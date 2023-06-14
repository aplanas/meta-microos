SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-django-push-notifications-3.0.0-2.4.noarch.rpm"
RPM_HASH = "4502d164ae4f3596d0a62784231b9c590907979a66dfde8a3dc4b5e763f07f236ea350477ffcf97e388aa14712d154070cccd05e5ad9adc3f38884dae920d2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-push-notifications \
python3.10dist-django-push-notifications \
python310-django-push-notifications \
python3dist-django-push-notifications"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pywebpush"

inherit rpm
