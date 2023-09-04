SUMMARY = "In-process task scheduler with Cron-like capabilities"
DESCRIPTION = "Advanced Python Scheduler (APScheduler) is an in-process task \
scheduler that lets you schedule jobs (functions or any python callables) to be \
executed at any time of your choosing. \
 \
This can be an alternative to externally run cron scripts for \
long-running applications (e.g. web applications), as it is platform neutral \
and can access the application's variables and functions. \
 \
APscheduler provides multiple job stores. \
 \
* Configurable scheduling mechanisms (triggers): \
  * Cron-like scheduling \
  * Delayed scheduling of single run jobs (like the UNIX 'at' command) \
  * Interval-based (run a job at specified time intervals) \
* Multiple, simultaneously active job stores: \
  * RAM \
  * File-based simple database (shelve) \
  * SQLAlchemy (any supported RDBMS works) \
  * MongoDB"
LICENSE = "MIT"

PV = "3.10.1"

RPM_NAME = "python39-APScheduler-3.10.1-2.1.noarch.rpm"
RPM_HASH = "e70900162559d32615752e04a2c95b204e70dee9d66f2286b07023693507090e84451fdcbbda117a5c36a76578a6b1fcf8152763254e20203b9e240f1a6a1f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apscheduler \
python39-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-six \
python39-tzlocal"

inherit rpm
