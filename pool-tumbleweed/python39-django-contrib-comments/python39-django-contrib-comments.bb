SUMMARY = "Framework for attaching comments to Django models"
DESCRIPTION = "This framework can be used to attach comments to any model, so you can use \
it for comments on blog entries, photos, book chapters, or anything else. \
 \
This is the same framework that was removed from Django 1.6."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-django-contrib-comments-2.2.0-1.3.noarch.rpm"
RPM_HASH = "e8450272b99009d0045cf916b28b61d7db9dd3c10ff2edf2adc3676cde001ad695bf4b3984871baf4b6db719ddf7d0845cb057ac88218ba1f37251c08dd59ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-contrib-comments) \
python39-django-contrib-comments \
python3dist(django-contrib-comments)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
