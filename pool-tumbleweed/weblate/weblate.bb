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

PV = "4.14.2"

RPM_NAME = "weblate-4.14.2-3.1.noarch.rpm"
RPM_HASH = "f4992647d5f2da56b1c935f2e18d78e4ff53f532028c9153efe2ac8250396d9af62fdcfae8f7033e493422877b0d4c4e97c46a80a8d7cbf176dc5ef9fc58a0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-weblate \
weblate"

RDEPENDS:${PN} += "-(apache2 and apache2-mod-wsgi) or (nginx and uwsgi) \
/bin/bash \
/bin/sh \
/usr/bin/python3 \
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
python3-bleach \
python3-celery \
python3-charset-normalizer \
python3-cssselect \
python3-diff-match-patch \
python3-django-appconf \
python3-django-compressor \
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
