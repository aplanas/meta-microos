SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-django-push-notifications-3.0.0-2.5.noarch.rpm"
RPM_HASH = "aafa6f34b0df54167aa719a187ee7dbdeaeea3faafed044a66ce4a5cbeb3b1cd04c21e10e52b0f04a1cc17bac9f55c8f6d9bf572e492f6d2467105672292bffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-push-notifications \
python39-django-push-notifications \
python3dist-django-push-notifications"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pywebpush"

inherit rpm
