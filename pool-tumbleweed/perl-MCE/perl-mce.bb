SUMMARY = "Many-Core Engine for Perl providing parallel processing capabilities"
DESCRIPTION = "MCE spawns a pool of workers and therefore does not fork a new process per \
each element of data. Instead, MCE follows a bank queuing model. Imagine \
the line being the data and bank-tellers the parallel workers. MCE enhances \
that model by adding the ability to chunk the next n elements from the \
input stream to the next available worker."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.887"

RPM_NAME = "perl-MCE-1.887-1.1.noarch.rpm"
RPM_HASH = "b2505376a46bfc39b43d8c87cb8d21df75b1d12c74e65841ec31f6fd991bf980d4f623795573de158348e291c12a471b92faa095d991a0c80ff064fe05f36e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MCE \
perl-MCE--Candy \
perl-MCE--Channel \
perl-MCE--Channel--Mutex \
perl-MCE--Channel--MutexFast \
perl-MCE--Channel--Simple \
perl-MCE--Channel--SimpleFast \
perl-MCE--Channel--Threads \
perl-MCE--Channel--ThreadsFast \
perl-MCE--Child \
perl-MCE--Core--Input--Generator \
perl-MCE--Core--Input--Handle \
perl-MCE--Core--Input--Iterator \
perl-MCE--Core--Input--Request \
perl-MCE--Core--Input--Sequence \
perl-MCE--Core--Manager \
perl-MCE--Core--Validation \
perl-MCE--Core--Worker \
perl-MCE--Flow \
perl-MCE--Grep \
perl-MCE--Loop \
perl-MCE--Map \
perl-MCE--Mutex \
perl-MCE--Mutex--Channel \
perl-MCE--Mutex--Channel2 \
perl-MCE--Mutex--Flock \
perl-MCE--Queue \
perl-MCE--Relay \
perl-MCE--Signal \
perl-MCE--Signal---tmpdir \
perl-MCE--Step \
perl-MCE--Stream \
perl-MCE--Subs \
perl-MCE--Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
