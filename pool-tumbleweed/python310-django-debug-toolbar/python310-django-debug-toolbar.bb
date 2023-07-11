SUMMARY = "A configurable set of panels that display various debug information"
DESCRIPTION = "The Django Debug Toolbar is a configurable set of panels that display various \
debug information about the current request/response and when clicked, display \
more details about the panel's content. \
 \
Currently, the following panels have been written and are working: \
 - Django version \
 - Request timer \
 - A list of settings in settings.py \
 - Common HTTP headers \
 - GET/POST/cookie/session variable display \
 - Templates and context used, and their template paths \
 - SQL queries including time to execute and links to EXPLAIN each query \
 - List of signals, their args and receivers \
 - Logging output via Python's built-in logging, or via the logbook module \
 \
There is also one Django management command currently: \
 - debugsqlshell: Outputs the SQL that gets executed as you work in the Python \
   interactive shell."
LICENSE = "BSD-3-Clause"

PV = "3.6"

RPM_NAME = "python310-django-debug-toolbar-3.6-2.1.noarch.rpm"
RPM_HASH = "46c6bd99b84480dfb28ac82dd3e5922f5a62956ae46d7537b7fff12eba4a2b800e83ce283b5ba4c2ffe683f3156beb0c7e21ae0da8825d28a8c3d46da5eb49d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-debug-toolbar \
python310-django-debug-toolbar \
python3dist-django-debug-toolbar"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-jinja \
python310-sqlparse"

inherit rpm
