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

RPM_NAME = "python39-APScheduler-3.10.1-1.5.noarch.rpm"
RPM_HASH = "a5ffcaffbcd2a6bb9e98f1d3adb12d707ca5ecf697e83203142dbf5fd011349cdca30a460d7aa8d18c6c6747371197b5f6424ee38d822d24e508c257f8034ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apscheduler \
python39-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-six \
python39-tzlocal"

inherit rpm
