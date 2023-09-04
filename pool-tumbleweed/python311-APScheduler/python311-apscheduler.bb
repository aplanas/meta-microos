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

RPM_NAME = "python311-APScheduler-3.10.1-2.1.noarch.rpm"
RPM_HASH = "311e29460e7d8a4a761f862136ef4894e8d938054e31dee6c4c6e582c55b71e5a16a47869c25f92faf471966a27fa4526c1544ab1f5d9eb7d06e2c324feaab52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-APScheduler \
python3.11dist-apscheduler \
python311-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-six \
python311-tzlocal"

inherit rpm
