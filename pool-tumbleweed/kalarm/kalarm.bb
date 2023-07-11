SUMMARY = "Personal Alarm Scheduler"
DESCRIPTION = "Personal alarm message, command and email scheduler by KDE."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kalarm-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fc8baad9795aa86c3074bcb373d8dbc9b59ad156767cf6bb0de88e434b949acb15ea5a3408543a1a1335e36a72747f36ccda2aecbe288beb2d3ff81fe47dea24"

RPROVIDES:${PN} += "config-kalarm \
kalarm \
kalarm5 \
libkalarmcalendar.so.5 \
libkalarmplugin.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5TextEditTextToSpeech.so.1 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IdentityManagementWidgets.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MailTransportAkonadi.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
