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

RPM_NAME = "python311-APScheduler-3.10.1-1.3.noarch.rpm"
RPM_HASH = "93a18d914ab1ace7a8f0a49270347d098ddd3788bf1bc8dabeea38869d41ae8c4e56e1d60edb4f4f26c066dbe81a71d7718fb110ac1530ec127baf6010370f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-apscheduler \
python311-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-six \
python311-tzlocal"

inherit rpm
