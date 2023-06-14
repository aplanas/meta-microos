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

RPM_NAME = "python39-APScheduler-3.10.1-1.3.noarch.rpm"
RPM_HASH = "4b9f5f20c64d9cd6d3e4875a0ceff06db0abd7ed487b8bbe239132490c56918b6f2fbfe3100ace67a863628a6b4bfadcb08fbcecc736aafebffe74f807631e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apscheduler \
python39-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-six \
python39-tzlocal"

inherit rpm
