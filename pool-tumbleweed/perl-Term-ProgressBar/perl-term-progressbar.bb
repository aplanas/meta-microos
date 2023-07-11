SUMMARY = "Provide a progress meter on a standard terminal"
DESCRIPTION = "Term::ProgressBar provides a simple progress bar on the terminal, to let \
the user know that something is happening, roughly how much stuff has been \
done, and maybe an estimate at how long remains. \
 \
A typical use sets up the progress bar with a number of items to do, and \
then calls update to update the bar whenever an item is processed. \
 \
Often, this would involve updating the progress bar many times with no \
user-visible change. To avoid unnecessary work, the update method returns a \
value, being the update value at which the user will next see a change. By \
only calling update when the current value exceeds the next update value, \
the call overhead is reduced. \
 \
Remember to call the '$progress->update($max_value)' when the job is done \
to get a nice 100% done bar. \
 \
A progress bar by default is simple; it just goes from left-to-right, \
filling the bar with '=' characters. These are called *major* characters. \
For long-running jobs, this may be too slow, so two additional features are \
available: a linear completion time estimator, and/or a *minor* character: \
this is a character that _moves_ from left-to-right on the progress bar (it \
does not fill it as the major character does), traversing once for each \
major-character added. This exponentially increases the granularity of the \
bar for the same width."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.23"

RPM_NAME = "perl-Term-ProgressBar-2.23-1.3.noarch.rpm"
RPM_HASH = "5302e512e94438b905293bff95a0c1cdd730e384d9cae7351518612c63cdab7e12a90228b56b704c0176751f7cc3b22ce835aa73d562aa98fc77b278fbc99dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--ProgressBar \
perl-Term--ProgressBar--IO \
perl-Term-ProgressBar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--MethodMaker \
perl-Term--ReadKey"

inherit rpm
