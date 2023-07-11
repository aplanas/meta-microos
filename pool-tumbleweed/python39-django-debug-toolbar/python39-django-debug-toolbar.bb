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

RPM_NAME = "python39-django-debug-toolbar-3.6-2.1.noarch.rpm"
RPM_HASH = "4511c8665611514798ca20f5a42325fbe5f1905cfd8a85311d55f3f62cd7def199e89e4b265c56bff385bf9bc571cc6d706ca288d1b8621e18073c57b732a74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-debug-toolbar \
python39-django-debug-toolbar \
python3dist-django-debug-toolbar"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-jinja \
python39-sqlparse"

inherit rpm
