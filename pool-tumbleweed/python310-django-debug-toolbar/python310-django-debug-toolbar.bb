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

RPM_NAME = "python310-django-debug-toolbar-3.6-1.4.noarch.rpm"
RPM_HASH = "4932e7e7bcb59799b51cb30edd5a322b1ad697be3995c5a32b804d014632aeb4942752bc04d339dfab3a7e44c258b3eb591345c44578bcec7f96336565256f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-debug-toolbar \
python3.10dist-django-debug-toolbar \
python310-django-debug-toolbar \
python3dist-django-debug-toolbar"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-jinja \
python310-sqlparse"

inherit rpm
