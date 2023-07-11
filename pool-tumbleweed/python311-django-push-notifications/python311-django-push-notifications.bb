SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-django-push-notifications-3.0.0-2.5.noarch.rpm"
RPM_HASH = "6a0fff2e787e0fa1998709d178523c7106e9cf17791e1d28f756acdedfc402446fb6b4f95d7b74ac38d604dc160b3a98a973d833aae071752e8a24a3cf2089c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-push-notifications \
python3.11dist-django-push-notifications \
python311-django-push-notifications \
python3dist-django-push-notifications"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-pywebpush"

inherit rpm
