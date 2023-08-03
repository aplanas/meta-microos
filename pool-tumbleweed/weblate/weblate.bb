SUMMARY = "Web-based translation tool"
DESCRIPTION = "Weblate is a free web-based translation tool with tight version control \
integration. It features simple and clean user interface, propagation of \
translations across components, quality checks and automatic linking to source \
files. \
 \
List of features includes: \
 \
* Easy web based translation \
* Propagation of translations across components (for different branches) \
* Tight git integration - every change is represented by Git commit \
* Usage of Django's admin interface \
* Upload and automatic merging of po files \
* Links to source files for context \
* Allows to use machine translation services \
* Message quality checks \
* Tunable access control \
* Wide range of supported translation formats (Getext, Qt, Java, Windows, Symbian and more)"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.2"

RPM_NAME = "weblate-4.18.2-1.1.noarch.rpm"
RPM_HASH = "2cd4fa90d4fed130aa330e3b3ad2181adb8adcf33a8d725b880371f38f4f3a3851df8fa250e88e9054e68f340bb64da530d1f7cec5b30b69732afc0c0f12cc34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-weblate \
weblate"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python \
/usr/bin/python3 \
/usr/bin/sh \
borgbackup \
cron \
git \
gpg2 \
postgresql \
postgresql-contrib \
python3-Cython \
python3-Django \
python3-GitPython \
python3-Levenshtein \
python3-Pillow \
python3-Pygments \
python3-celery \
python3-charset-normalizer \
python3-cssselect \
python3-diff-match-patch \
python3-django-appconf \
python3-django-celery-beat \
python3-django-compressor \
python3-django-cors-headers \
python3-django-crispy-forms \
python3-django-filter \
python3-django-redis \
python3-djangorestframework \
python3-filelock \
python3-fluent \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-hiredis \
python3-html2text \
python3-jsonschema \
python3-lxml \
python3-misaka \
python3-nh3 \
python3-openpyxl \
python3-packaging \
python3-psycopg2 \
python3-pyahocorasick \
python3-pycairo \
python3-pyicumessageformat \
python3-pyparsing \
python3-python-dateutil \
python3-python-redis-lock \
python3-rapidfuzz \
python3-requests \
python3-sentry-sdk \
python3-setuptools \
python3-siphashc \
python3-social-auth-app-django \
python3-social-auth-core \
python3-translation-finder \
python3-user-agents \
python3-weblate-language-data \
python3-weblate-schemas \
translate-toolkit \
typelib-Pango \
typelib-PangoCairo \
user-wwwrun"

inherit rpm
