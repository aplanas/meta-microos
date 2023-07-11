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

RPM_NAME = "python310-APScheduler-3.10.1-1.5.noarch.rpm"
RPM_HASH = "c4a61b8a157c294b9c0fa028b6b959e232103c7974d19237d64c051b95c178523824decb405e0b6eaa776384d8eacad70856bc93cd2634fbfc867ee9dc8a8aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apscheduler \
python310-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python310-pytz \
python310-six \
python310-tzlocal"

inherit rpm
